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
// source: google/protobuf/any.proto

package com.google.protobuf;

public interface AnyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.protobuf.Any)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string type_url = 1 [ctype = STRING_PIECE];</code>
   *
   * <pre>
   * A URL/resource name whose content describes the type of the
   * serialized message.
   * For URLs which use the schema `http`, `https`, or no schema, the
   * following restrictions and interpretations apply:
   * * If no schema is provided, `https` is assumed.
   * * The last segment of the URL's path must represent the fully
   *   qualified name of the type (as in `path/google.protobuf.Duration`).
   * * An HTTP GET on the URL must yield a [google.protobuf.Type][]
   *   value in binary format, or produce an error.
   * * Applications are allowed to cache lookup results based on the
   *   URL, or have them precompiled into a binary to avoid any
   *   lookup. Therefore, binary compatibility needs to be preserved
   *   on changes to types. (Use versioned type names to manage
   *   breaking changes.)
   * Schemas other than `http`, `https` (or the empty schema) might be
   * used with implementation specific semantics.
   *
   * </pre>
   */
  java.lang.String getTypeUrl();
  /**
   * <code>optional string type_url = 1 [ctype = STRING_PIECE];</code>
   *
   * <pre>
   * A URL/resource name whose content describes the type of the
   * serialized message.
   * For URLs which use the schema `http`, `https`, or no schema, the
   * following restrictions and interpretations apply:
   * * If no schema is provided, `https` is assumed.
   * * The last segment of the URL's path must represent the fully
   *   qualified name of the type (as in `path/google.protobuf.Duration`).
   * * An HTTP GET on the URL must yield a [google.protobuf.Type][]
   *   value in binary format, or produce an error.
   * * Applications are allowed to cache lookup results based on the
   *   URL, or have them precompiled into a binary to avoid any
   *   lookup. Therefore, binary compatibility needs to be preserved
   *   on changes to types. (Use versioned type names to manage
   *   breaking changes.)
   * Schemas other than `http`, `https` (or the empty schema) might be
   * used with implementation specific semantics.
   *
   * </pre>
   */
  com.google.protobuf.ByteString
      getTypeUrlBytes();

  /**
   * <code>optional bytes value = 2 [ctype = CORD];</code>
   *
   * <pre>
   * Must be valid serialized data of the above specified type.
   * </pre>
   */
  com.google.protobuf.ByteString getValue();
}