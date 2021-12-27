package com.enelyzer.facility.domain

import com.akkaserverless.scalasdk.testkit.ValueEntityResult
import com.akkaserverless.scalasdk.valueentity.ValueEntity
import com.enelyzer.shoppingcart
import com.google.protobuf.empty.Empty
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class FacilitySpec
    extends AnyWordSpec
    with Matchers {

  "Facility" must {

    "have example test that can be removed" in {
      val testKit = FacilityTestKit(new Facility(_))
      // use the testkit to execute a command
      // and verify final updated state:
      // val result = testKit.someOperation(SomeRequest)
      // verify the response
      // val actualResponse = result.getReply()
      // actualResponse shouldBe expectedResponse
      // verify the final state after the command
      // testKit.currentState() shouldBe expectedState
    }

    "handle command UpdateFacility" in {
      val testKit = FacilityTestKit(new Facility(_))
      // val result = testKit.updateFacility(shoppingcart.UpdateRequest(...))
    }

    "handle command UpdateOwner" in {
      val testKit = FacilityTestKit(new Facility(_))
      // val result = testKit.updateOwner(shoppingcart.UpdateOwnerRequest(...))
    }

    "handle command UpdateInfo" in {
      val testKit = FacilityTestKit(new Facility(_))
      // val result = testKit.updateInfo(shoppingcart.UpdateInfoRequest(...))
    }

    "handle command UpdateAddress" in {
      val testKit = FacilityTestKit(new Facility(_))
      // val result = testKit.updateAddress(shoppingcart.UpdateAddressRequest(...))
    }

    "handle command AddBuilding" in {
      val testKit = FacilityTestKit(new Facility(_))
      // val result = testKit.addBuilding(shoppingcart.AddBuildingRequest(...))
    }

    "handle command RemoveBuilding" in {
      val testKit = FacilityTestKit(new Facility(_))
      // val result = testKit.removeBuilding(shoppingcart.RemoveBuildingRequest(...))
    }

    "handle command Get" in {
      val testKit = FacilityTestKit(new Facility(_))
      // val result = testKit.get(shoppingcart.GetRequest(...))
    }

  }
}
