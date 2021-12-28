package com.enelyzer.facility.domain

import com.akkaserverless.scalasdk.valueentity.ValueEntity
import com.akkaserverless.scalasdk.valueentity.ValueEntityContext
import com.enelyzer.facility
import com.enelyzer.facility.{CreateFacility, FacilityResponse}
import com.google.protobuf.empty.Empty

import java.time.Instant

// This class was initially generated based on the .proto definition by Akka Serverless tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

/** A value entity. */
class Facility(context: ValueEntityContext) extends AbstractFacility {

  override def emptyState: FacilityState = FacilityState.defaultInstance

  /** Command handlers */
  override def updateFacility(currentState: FacilityState, updateRequest: facility.UpdateRequest): ValueEntity.Effect[Empty] =
    effects.error("The command handler for `UpdateFacility` is not implemented, yet")

  override def updateOwner(currentState: FacilityState, updateOwnerRequest: facility.UpdateOwnerRequest): ValueEntity.Effect[Empty] =
    effects.error("The command handler for `UpdateOwner` is not implemented, yet")

  override def updateInfo(currentState: FacilityState, updateInfoRequest: facility.UpdateInfoRequest): ValueEntity.Effect[Empty] =
    effects.error("The command handler for `UpdateInfo` is not implemented, yet")

  override def updateAddress(currentState: FacilityState, updateAddressRequest: facility.UpdateAddressRequest): ValueEntity.Effect[Empty] =
    effects.error("The command handler for `UpdateAddress` is not implemented, yet")

  override def addBuilding(currentState: FacilityState, addBuildingRequest: facility.AddBuildingRequest): ValueEntity.Effect[Empty] =
    effects.error("The command handler for `AddBuilding` is not implemented, yet")

  override def removeBuilding(currentState: FacilityState, removeBuildingRequest: facility.RemoveBuildingRequest): ValueEntity.Effect[Empty] =
    effects.error("The command handler for `RemoveBuilding` is not implemented, yet")

  override def get(currentState: FacilityState, getRequest: facility.GetRequest): ValueEntity.Effect[facility.FacilityResponse] = effects.reply(toApi(currentState))

  override def create(currentState: FacilityState, createFacility: CreateFacility): ValueEntity.Effect[Empty] = {
    if (currentState.created > 0) effects.error("Cart was already created")
    else effects.updateState(currentState.copy(id = createFacility.facilityId, name = createFacility.name, facilityType = toDomain(createFacility.facilityType), created = Instant.now().toEpochMilli)).thenReply(Empty.defaultInstance)
  }

  /** Converters */
  private def toApi(facility: FacilityState): FacilityResponse = FacilityResponse(id = facility.id, name = facility.name)

  private def toDomain(facilityType: facility.FacilityType): facility.domain.FacilityType = facility.domain.FacilityType.fromValue(facilityType.value)
}

