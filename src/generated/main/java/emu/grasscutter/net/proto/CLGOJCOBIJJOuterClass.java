// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CLGOJCOBIJJ.proto

package emu.grasscutter.net.proto;

public final class CLGOJCOBIJJOuterClass {
  private CLGOJCOBIJJOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CLGOJCOBIJJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CLGOJCOBIJJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string share_code = 11;</code>
     * @return The shareCode.
     */
    java.lang.String getShareCode();
    /**
     * <code>string share_code = 11;</code>
     * @return The bytes for shareCode.
     */
    com.google.protobuf.ByteString
        getShareCodeBytes();

    /**
     * <code>.IJBPEPPLINK KIEKKNKGMIF = 4;</code>
     * @return The enum numeric value on the wire for kIEKKNKGMIF.
     */
    int getKIEKKNKGMIFValue();
    /**
     * <code>.IJBPEPPLINK KIEKKNKGMIF = 4;</code>
     * @return The kIEKKNKGMIF.
     */
    emu.grasscutter.net.proto.IJBPEPPLINKOuterClass.IJBPEPPLINK getKIEKKNKGMIF();
  }
  /**
   * <pre>
   * CmdId: 9171
   * </pre>
   *
   * Protobuf type {@code CLGOJCOBIJJ}
   */
  public static final class CLGOJCOBIJJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CLGOJCOBIJJ)
      CLGOJCOBIJJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CLGOJCOBIJJ.newBuilder() to construct.
    private CLGOJCOBIJJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CLGOJCOBIJJ() {
      shareCode_ = "";
      kIEKKNKGMIF_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CLGOJCOBIJJ();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CLGOJCOBIJJ(
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
            case 32: {
              int rawValue = input.readEnum();

              kIEKKNKGMIF_ = rawValue;
              break;
            }
            case 90: {
              java.lang.String s = input.readStringRequireUtf8();

              shareCode_ = s;
              break;
            }
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
      return emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.internal_static_CLGOJCOBIJJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.internal_static_CLGOJCOBIJJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ.class, emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ.Builder.class);
    }

    public static final int SHARE_CODE_FIELD_NUMBER = 11;
    private volatile java.lang.Object shareCode_;
    /**
     * <code>string share_code = 11;</code>
     * @return The shareCode.
     */
    @java.lang.Override
    public java.lang.String getShareCode() {
      java.lang.Object ref = shareCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shareCode_ = s;
        return s;
      }
    }
    /**
     * <code>string share_code = 11;</code>
     * @return The bytes for shareCode.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getShareCodeBytes() {
      java.lang.Object ref = shareCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shareCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int KIEKKNKGMIF_FIELD_NUMBER = 4;
    private int kIEKKNKGMIF_;
    /**
     * <code>.IJBPEPPLINK KIEKKNKGMIF = 4;</code>
     * @return The enum numeric value on the wire for kIEKKNKGMIF.
     */
    @java.lang.Override public int getKIEKKNKGMIFValue() {
      return kIEKKNKGMIF_;
    }
    /**
     * <code>.IJBPEPPLINK KIEKKNKGMIF = 4;</code>
     * @return The kIEKKNKGMIF.
     */
    @java.lang.Override public emu.grasscutter.net.proto.IJBPEPPLINKOuterClass.IJBPEPPLINK getKIEKKNKGMIF() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.IJBPEPPLINKOuterClass.IJBPEPPLINK result = emu.grasscutter.net.proto.IJBPEPPLINKOuterClass.IJBPEPPLINK.valueOf(kIEKKNKGMIF_);
      return result == null ? emu.grasscutter.net.proto.IJBPEPPLINKOuterClass.IJBPEPPLINK.UNRECOGNIZED : result;
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
      if (kIEKKNKGMIF_ != emu.grasscutter.net.proto.IJBPEPPLINKOuterClass.IJBPEPPLINK.IJBPEPPLINK_None.getNumber()) {
        output.writeEnum(4, kIEKKNKGMIF_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shareCode_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 11, shareCode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (kIEKKNKGMIF_ != emu.grasscutter.net.proto.IJBPEPPLINKOuterClass.IJBPEPPLINK.IJBPEPPLINK_None.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, kIEKKNKGMIF_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shareCode_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, shareCode_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ other = (emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ) obj;

      if (!getShareCode()
          .equals(other.getShareCode())) return false;
      if (kIEKKNKGMIF_ != other.kIEKKNKGMIF_) return false;
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
      hash = (37 * hash) + SHARE_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getShareCode().hashCode();
      hash = (37 * hash) + KIEKKNKGMIF_FIELD_NUMBER;
      hash = (53 * hash) + kIEKKNKGMIF_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ prototype) {
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
     * CmdId: 9171
     * </pre>
     *
     * Protobuf type {@code CLGOJCOBIJJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CLGOJCOBIJJ)
        emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.internal_static_CLGOJCOBIJJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.internal_static_CLGOJCOBIJJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ.class, emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ.newBuilder()
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
        shareCode_ = "";

        kIEKKNKGMIF_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.internal_static_CLGOJCOBIJJ_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ build() {
        emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ buildPartial() {
        emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ result = new emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ(this);
        result.shareCode_ = shareCode_;
        result.kIEKKNKGMIF_ = kIEKKNKGMIF_;
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
        if (other instanceof emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ) {
          return mergeFrom((emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ other) {
        if (other == emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ.getDefaultInstance()) return this;
        if (!other.getShareCode().isEmpty()) {
          shareCode_ = other.shareCode_;
          onChanged();
        }
        if (other.kIEKKNKGMIF_ != 0) {
          setKIEKKNKGMIFValue(other.getKIEKKNKGMIFValue());
        }
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
        emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object shareCode_ = "";
      /**
       * <code>string share_code = 11;</code>
       * @return The shareCode.
       */
      public java.lang.String getShareCode() {
        java.lang.Object ref = shareCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          shareCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string share_code = 11;</code>
       * @return The bytes for shareCode.
       */
      public com.google.protobuf.ByteString
          getShareCodeBytes() {
        java.lang.Object ref = shareCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          shareCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string share_code = 11;</code>
       * @param value The shareCode to set.
       * @return This builder for chaining.
       */
      public Builder setShareCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        shareCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string share_code = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearShareCode() {
        
        shareCode_ = getDefaultInstance().getShareCode();
        onChanged();
        return this;
      }
      /**
       * <code>string share_code = 11;</code>
       * @param value The bytes for shareCode to set.
       * @return This builder for chaining.
       */
      public Builder setShareCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        shareCode_ = value;
        onChanged();
        return this;
      }

      private int kIEKKNKGMIF_ = 0;
      /**
       * <code>.IJBPEPPLINK KIEKKNKGMIF = 4;</code>
       * @return The enum numeric value on the wire for kIEKKNKGMIF.
       */
      @java.lang.Override public int getKIEKKNKGMIFValue() {
        return kIEKKNKGMIF_;
      }
      /**
       * <code>.IJBPEPPLINK KIEKKNKGMIF = 4;</code>
       * @param value The enum numeric value on the wire for kIEKKNKGMIF to set.
       * @return This builder for chaining.
       */
      public Builder setKIEKKNKGMIFValue(int value) {
        
        kIEKKNKGMIF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.IJBPEPPLINK KIEKKNKGMIF = 4;</code>
       * @return The kIEKKNKGMIF.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.IJBPEPPLINKOuterClass.IJBPEPPLINK getKIEKKNKGMIF() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.IJBPEPPLINKOuterClass.IJBPEPPLINK result = emu.grasscutter.net.proto.IJBPEPPLINKOuterClass.IJBPEPPLINK.valueOf(kIEKKNKGMIF_);
        return result == null ? emu.grasscutter.net.proto.IJBPEPPLINKOuterClass.IJBPEPPLINK.UNRECOGNIZED : result;
      }
      /**
       * <code>.IJBPEPPLINK KIEKKNKGMIF = 4;</code>
       * @param value The kIEKKNKGMIF to set.
       * @return This builder for chaining.
       */
      public Builder setKIEKKNKGMIF(emu.grasscutter.net.proto.IJBPEPPLINKOuterClass.IJBPEPPLINK value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        kIEKKNKGMIF_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.IJBPEPPLINK KIEKKNKGMIF = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearKIEKKNKGMIF() {
        
        kIEKKNKGMIF_ = 0;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:CLGOJCOBIJJ)
    }

    // @@protoc_insertion_point(class_scope:CLGOJCOBIJJ)
    private static final emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ();
    }

    public static emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CLGOJCOBIJJ>
        PARSER = new com.google.protobuf.AbstractParser<CLGOJCOBIJJ>() {
      @java.lang.Override
      public CLGOJCOBIJJ parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CLGOJCOBIJJ(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CLGOJCOBIJJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CLGOJCOBIJJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CLGOJCOBIJJOuterClass.CLGOJCOBIJJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CLGOJCOBIJJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CLGOJCOBIJJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CLGOJCOBIJJ.proto\032\021IJBPEPPLINK.proto\"D" +
      "\n\013CLGOJCOBIJJ\022\022\n\nshare_code\030\013 \001(\t\022!\n\013KIE" +
      "KKNKGMIF\030\004 \001(\0162\014.IJBPEPPLINKB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.IJBPEPPLINKOuterClass.getDescriptor(),
        });
    internal_static_CLGOJCOBIJJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CLGOJCOBIJJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CLGOJCOBIJJ_descriptor,
        new java.lang.String[] { "ShareCode", "KIEKKNKGMIF", });
    emu.grasscutter.net.proto.IJBPEPPLINKOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
