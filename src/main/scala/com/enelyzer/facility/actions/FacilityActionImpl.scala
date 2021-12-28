package com.enelyzer.facility.actions

import com.akkaserverless.scalasdk.action.Action
import com.akkaserverless.scalasdk.action.ActionCreationContext
import com.google.protobuf.empty.Empty

// This class was initially generated based on the .proto definition by Akka Serverless tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

/** An action. */
class FacilityActionImpl(creationContext: ActionCreationContext) extends AbstractFacilityAction {

  /** Handler for "GetFacilityTypes". */
  override def getFacilityTypes(empty: Empty): Action.Effect[FacilityTypesResponse] = effects.reply(FacilityTypesResponse(facilityTypes = com.enelyzer.facility.domain.FacilityType.values.map(_.toString)))
}

