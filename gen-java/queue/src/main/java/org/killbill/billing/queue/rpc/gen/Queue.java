// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/queue.proto

package org.killbill.billing.queue.rpc.gen;

public final class Queue {
  private Queue() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_queue_EventMsg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_queue_EventMsg_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_queue_PostEventResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_queue_PostEventResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_queue_AckRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_queue_AckRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_queue_AckResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_queue_AckResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_queue_CloseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_queue_CloseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_queue_CloseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_queue_CloseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_queue_SubscriptionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_queue_SubscriptionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_queue_SubscriptionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_queue_SubscriptionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017api/queue.proto\022\005queue\032\037google/protobu" +
      "f/timestamp.proto\"\276\001\n\010EventMsg\022\021\n\tclient" +
      "_id\030\001 \001(\t\022\022\n\nevent_json\030\003 \001(\t\022\022\n\nuser_to" +
      "ken\030\004 \001(\t\022\031\n\021future_user_token\030\005 \001(\t\0222\n\016" +
      "effective_date\030\006 \001(\0132\032.google.protobuf.T" +
      "imestamp\022\023\n\013search_key1\030\007 \001(\003\022\023\n\013search_" +
      "key2\030\010 \001(\003\"\023\n\021PostEventResponse\"1\n\nAckRe" +
      "quest\022\022\n\nuser_token\030\001 \001(\t\022\017\n\007success\030\002 \001" +
      "(\010\"\r\n\013AckResponse\"!\n\014CloseRequest\022\021\n\tcli" +
      "ent_id\030\001 \001(\t\"\017\n\rCloseResponse\"=\n\023Subscri" +
      "ptionRequest\022\021\n\tclient_id\030\001 \001(\t\022\023\n\013searc" +
      "h_key2\030\002 \001(\003\"\026\n\024SubscriptionResponse2\346\001\n" +
      "\010QueueApi\0226\n\tPostEvent\022\017.queue.EventMsg\032" +
      "\030.queue.PostEventResponse\022@\n\017SubscribeEv" +
      "ents\022\032.queue.SubscriptionRequest\032\017.queue" +
      ".EventMsg0\001\022,\n\003Ack\022\021.queue.AckRequest\032\022." +
      "queue.AckResponse\0222\n\005Close\022\023.queue.Close" +
      "Request\032\024.queue.CloseResponseBR\n\"org.kil" +
      "lbill.billing.queue.rpc.genP\001Z*github.co" +
      "m/killbill/standalone-queue;queueb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_queue_EventMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_queue_EventMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_queue_EventMsg_descriptor,
        new java.lang.String[] { "ClientId", "EventJson", "UserToken", "FutureUserToken", "EffectiveDate", "SearchKey1", "SearchKey2", });
    internal_static_queue_PostEventResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_queue_PostEventResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_queue_PostEventResponse_descriptor,
        new java.lang.String[] { });
    internal_static_queue_AckRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_queue_AckRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_queue_AckRequest_descriptor,
        new java.lang.String[] { "UserToken", "Success", });
    internal_static_queue_AckResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_queue_AckResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_queue_AckResponse_descriptor,
        new java.lang.String[] { });
    internal_static_queue_CloseRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_queue_CloseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_queue_CloseRequest_descriptor,
        new java.lang.String[] { "ClientId", });
    internal_static_queue_CloseResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_queue_CloseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_queue_CloseResponse_descriptor,
        new java.lang.String[] { });
    internal_static_queue_SubscriptionRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_queue_SubscriptionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_queue_SubscriptionRequest_descriptor,
        new java.lang.String[] { "ClientId", "SearchKey2", });
    internal_static_queue_SubscriptionResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_queue_SubscriptionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_queue_SubscriptionResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
