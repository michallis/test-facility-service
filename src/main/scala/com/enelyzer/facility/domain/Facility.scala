package com.enelyzer.facility.domain

import com.akkaserverless.scalasdk.valueentity.ValueEntity
import com.akkaserverless.scalasdk.valueentity.ValueEntityContext
import com.enelyzer.shoppingcart
import com.google.protobuf.empty.Empty

// This class was initially generated based on the .proto definition by Akka Serverless tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

/** A value entity. */
class Facility(context: ValueEntityContext) extends AbstractFacility {
  override def emptyState: FacilityState =
    throw new UnsupportedOperationException("Not implemented yet, replace with your empty entity state")

  override def updateFacility(currentState: FacilityState, updateRequest: shoppingcart.UpdateRequest): ValueEntity.Effect[Empty] =
    effects.error("The command handler for `UpdateFacility` is not implemented, yet")

  override def updateOwner(currentState: FacilityState, updateOwnerRequest: shoppingcart.UpdateOwnerRequest): ValueEntity.Effect[Empty] =
    effects.error("The command handler for `UpdateOwner` is not implemented, yet")

  override def updateInfo(currentState: FacilityState, updateInfoRequest: shoppingcart.UpdateInfoRequest): ValueEntity.Effect[Empty] =
    effects.error("The command handler for `UpdateInfo` is not implemented, yet")

  override def updateAddress(currentState: FacilityState, updateAddressRequest: shoppingcart.UpdateAddressRequest): ValueEntity.Effect[Empty] =
    effects.error("The command handler for `UpdateAddress` is not implemented, yet")

  override def addBuilding(currentState: FacilityState, addBuildingRequest: shoppingcart.AddBuildingRequest): ValueEntity.Effect[Empty] =
    effects.error("The command handler for `AddBuilding` is not implemented, yet")

  override def removeBuilding(currentState: FacilityState, removeBuildingRequest: shoppingcart.RemoveBuildingRequest): ValueEntity.Effect[Empty] =
    effects.error("The command handler for `RemoveBuilding` is not implemented, yet")

  override def get(currentState: FacilityState, getRequest: shoppingcart.GetRequest): ValueEntity.Effect[shoppingcart.FacilityResponse] =
    effects.error("The command handler for `Get` is not implemented, yet")

}

