package recs

import software.constructs.Construct
import software.amazon.awscdk.Stack
import software.amazon.awscdk.StackProps
// import software.amazon.awscdk.Duration
// import software.amazon.awscdk.services.sqs.Queue

class RecsStack(val scope: Construct, val id: String, val props: StackProps = null) extends Stack(scope, id, props) {
  // The code that defines your stack goes here

  // example resources
//   final Queue queue = Queue.Builder.create(this, "TestQueue")
//    .visibilityTimeout(Duration.seconds(300))
//    .build();

}
