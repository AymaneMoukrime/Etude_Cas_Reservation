// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Reservation.proto

package com.res.reservation.stubs;

public interface ChambreRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ChambreRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.TypeChambre type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.TypeChambre type = 1;</code>
   * @return The type.
   */
  com.res.reservation.stubs.TypeChambre getType();

  /**
   * <code>float prix = 2;</code>
   * @return The prix.
   */
  float getPrix();

  /**
   * <code>bool disponible = 3;</code>
   * @return The disponible.
   */
  boolean getDisponible();
}
