// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface DistributionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.Distribution)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 count = 1;</code>
   * @return The count.
   */
  long getCount();

  /**
   * <code>float mean = 2;</code>
   * @return The mean.
   */
  float getMean();

  /**
   * <code>double sum_of_squared_deviation = 3;</code>
   * @return The sumOfSquaredDeviation.
   */
  double getSumOfSquaredDeviation();

  /**
   * <code>.POGOProtos.Rpc.Distribution.Range range = 4;</code>
   * @return Whether the range field is set.
   */
  boolean hasRange();
  /**
   * <code>.POGOProtos.Rpc.Distribution.Range range = 4;</code>
   * @return The range.
   */
  POGOProtos.Rpc.Distribution.Range getRange();
  /**
   * <code>.POGOProtos.Rpc.Distribution.Range range = 4;</code>
   */
  POGOProtos.Rpc.Distribution.RangeOrBuilder getRangeOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.Distribution.BucketOptions bucket_options = 5;</code>
   * @return Whether the bucketOptions field is set.
   */
  boolean hasBucketOptions();
  /**
   * <code>.POGOProtos.Rpc.Distribution.BucketOptions bucket_options = 5;</code>
   * @return The bucketOptions.
   */
  POGOProtos.Rpc.Distribution.BucketOptions getBucketOptions();
  /**
   * <code>.POGOProtos.Rpc.Distribution.BucketOptions bucket_options = 5;</code>
   */
  POGOProtos.Rpc.Distribution.BucketOptionsOrBuilder getBucketOptionsOrBuilder();

  /**
   * <code>repeated int64 bucket_counts = 6;</code>
   * @return A list containing the bucketCounts.
   */
  java.util.List<java.lang.Long> getBucketCountsList();
  /**
   * <code>repeated int64 bucket_counts = 6;</code>
   * @return The count of bucketCounts.
   */
  int getBucketCountsCount();
  /**
   * <code>repeated int64 bucket_counts = 6;</code>
   * @param index The index of the element to return.
   * @return The bucketCounts at the given index.
   */
  long getBucketCounts(int index);
}
