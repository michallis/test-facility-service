package com.enelyzer.facility.actions

import com.akkaserverless.scalasdk.action.Action
import com.akkaserverless.scalasdk.testkit.ActionResult
import com.google.protobuf.empty.Empty
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

// This class was initially generated based on the .proto definition by Akka Serverless tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

class FacilityActionImplSpec
    extends AnyWordSpec
    with ScalaFutures
    with Matchers {

  "FacilityActionImpl" must {

    "returns all facility types available" in {
      val testKit = FacilityActionImplTestKit(new FacilityActionImpl(_))
      val result = testKit.getFacilityTypes(Empty.defaultInstance);
      result.reply.facilityTypes should not be empty
      result.reply.facilityTypes.length shouldBe 4 //fixed set
    }
  }
}
