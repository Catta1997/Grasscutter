// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgPhaseContinue.proto

package emu.grasscutter.net.proto;

public final class GCGMsgPhaseContinueOuterClass {
  private GCGMsgPhaseContinueOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgPhaseContinueOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgPhaseContinue)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * Obf: GFDFCHHFLNJ
   * </pre>
   *
   * Protobuf type {@code GCGMsgPhaseContinue}
   */
  public static final class GCGMsgPhaseContinue extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgPhaseContinue)
      GCGMsgPhaseContinueOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgPhaseContinue.newBuilder() to construct.
    private GCGMsgPhaseContinue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgPhaseContinue() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgPhaseContinue();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGMsgPhaseContinue(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.internal_static_GCGMsgPhaseContinue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.internal_static_GCGMsgPhaseContinue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue.class, emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue other = (emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue) obj;

      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Obf: GFDFCHHFLNJ
     * </pre>
     *
     * Protobuf type {@code GCGMsgPhaseContinue}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgPhaseContinue)
        emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinueOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.internal_static_GCGMsgPhaseContinue_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.internal_static_GCGMsgPhaseContinue_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue.class, emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.internal_static_GCGMsgPhaseContinue_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue build() {
        emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue buildPartial() {
        emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue result = new emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue(this);
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue) {
          return mergeFrom((emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue other) {
        if (other == emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GCGMsgPhaseContinue)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgPhaseContinue)
    private static final emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue();
    }

    public static emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgPhaseContinue>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgPhaseContinue>() {
      @java.lang.Override
      public GCGMsgPhaseContinue parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGMsgPhaseContinue(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGMsgPhaseContinue> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgPhaseContinue> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGMsgPhaseContinueOuterClass.GCGMsgPhaseContinue getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgPhaseContinue_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgPhaseContinue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031GCGMsgPhaseContinue.proto\"\025\n\023GCGMsgPha" +
      "seContinueB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGMsgPhaseContinue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgPhaseContinue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgPhaseContinue_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
