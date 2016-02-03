/*
 * Copyright 2015, Google Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *     * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *     * Neither the name of Google Inc. nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/metric.proto

package com.google.api;

public final class MetricProto {
  private MetricProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MetricDescriptor_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_MetricDescriptor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027google/api/metric.proto\022\ngoogle.api\032\026g" +
      "oogle/api/label.proto\"\304\003\n\020MetricDescript" +
      "or\022\014\n\004name\030\001 \001(\t\022+\n\006labels\030\002 \003(\0132\033.googl" +
      "e.api.LabelDescriptor\022<\n\013metric_kind\030\003 \001" +
      "(\0162\'.google.api.MetricDescriptor.MetricK" +
      "ind\022:\n\nvalue_type\030\004 \001(\0162&.google.api.Met" +
      "ricDescriptor.ValueType\022\014\n\004unit\030\005 \001(\t\022\023\n" +
      "\013description\030\006 \001(\t\022\024\n\014display_name\030\007 \001(\t" +
      "\"O\n\nMetricKind\022\033\n\027METRIC_KIND_UNSPECIFIE" +
      "D\020\000\022\t\n\005GAUGE\020\001\022\t\n\005DELTA\020\002\022\016\n\nCUMULATIVE\020",
      "\003\"q\n\tValueType\022\032\n\026VALUE_TYPE_UNSPECIFIED" +
      "\020\000\022\010\n\004BOOL\020\001\022\t\n\005INT64\020\002\022\n\n\006DOUBLE\020\003\022\n\n\006S" +
      "TRING\020\004\022\020\n\014DISTRIBUTION\020\005\022\t\n\005MONEY\020\006B\037\n\016" +
      "com.google.apiB\013MetricProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.LabelProto.getDescriptor(),
        }, assigner);
    internal_static_google_api_MetricDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_MetricDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_MetricDescriptor_descriptor,
        new java.lang.String[] { "Name", "Labels", "MetricKind", "ValueType", "Unit", "Description", "DisplayName", });
    com.google.api.LabelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}