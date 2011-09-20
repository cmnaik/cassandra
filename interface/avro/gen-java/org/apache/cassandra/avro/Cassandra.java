package org.apache.cassandra.avro;

@SuppressWarnings("all")
public interface Cassandra {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"Cassandra\",\"namespace\":\"org.apache.cassandra.avro\",\"types\":[{\"type\":\"record\",\"name\":\"ColumnPath\",\"fields\":[{\"name\":\"column_family\",\"type\":\"string\"},{\"name\":\"super_column\",\"type\":[\"bytes\",\"null\"]},{\"name\":\"column\",\"type\":[\"bytes\",\"null\"]}]},{\"type\":\"record\",\"name\":\"Column\",\"fields\":[{\"name\":\"name\",\"type\":\"bytes\"},{\"name\":\"value\",\"type\":\"bytes\"},{\"name\":\"timestamp\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"SuperColumn\",\"fields\":[{\"name\":\"name\",\"type\":\"bytes\"},{\"name\":\"columns\",\"type\":{\"type\":\"array\",\"items\":\"Column\"}}]},{\"type\":\"record\",\"name\":\"ColumnOrSuperColumn\",\"fields\":[{\"name\":\"column\",\"type\":[\"Column\",\"null\"]},{\"name\":\"super_column\",\"type\":[\"SuperColumn\",\"null\"]}]},{\"type\":\"enum\",\"name\":\"ConsistencyLevel\",\"symbols\":[\"ZERO\",\"ONE\",\"QUORUM\",\"DCQUORUM\",\"DCQUORUMSYNC\",\"ALL\"]},{\"type\":\"error\",\"name\":\"InvalidRequestException\",\"fields\":[{\"name\":\"why\",\"type\":[\"string\",\"null\"]}]},{\"type\":\"error\",\"name\":\"NotFoundException\",\"fields\":[{\"name\":\"why\",\"type\":[\"string\",\"null\"]}]},{\"type\":\"error\",\"name\":\"UnavailableException\",\"fields\":[{\"name\":\"why\",\"type\":[\"string\",\"null\"]}]},{\"type\":\"error\",\"name\":\"TimedOutException\",\"fields\":[{\"name\":\"why\",\"type\":[\"string\",\"null\"]}]}],\"messages\":{\"get\":{\"request\":[{\"name\":\"keyspace\",\"type\":\"string\"},{\"name\":\"key\",\"type\":\"string\"},{\"name\":\"column_path\",\"type\":\"ColumnPath\"},{\"name\":\"consistency_level\",\"type\":\"ConsistencyLevel\"}],\"response\":\"ColumnOrSuperColumn\",\"errors\":[\"InvalidRequestException\",\"NotFoundException\",\"UnavailableException\",\"TimedOutException\"]},\"insert\":{\"request\":[{\"name\":\"keyspace\",\"type\":\"string\"},{\"name\":\"key\",\"type\":\"string\"},{\"name\":\"column_path\",\"type\":\"ColumnPath\"},{\"name\":\"value\",\"type\":\"bytes\"},{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"consistency_level\",\"type\":\"ConsistencyLevel\"}],\"response\":\"null\",\"errors\":[\"InvalidRequestException\",\"UnavailableException\",\"TimedOutException\"]},\"batch_insert\":{\"request\":[{\"name\":\"keyspace\",\"type\":\"string\"},{\"name\":\"key\",\"type\":\"string\"},{\"name\":\"cfmap\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"ColumnOrSuperColumn\"}}},{\"name\":\"consistency_level\",\"type\":\"ConsistencyLevel\"}],\"response\":\"null\",\"errors\":[\"InvalidRequestException\",\"UnavailableException\",\"TimedOutException\"]},\"get_api_version\":{\"request\":[],\"response\":\"string\"}}}");
  org.apache.cassandra.avro.ColumnOrSuperColumn get(org.apache.avro.util.Utf8 keyspace, org.apache.avro.util.Utf8 key, org.apache.cassandra.avro.ColumnPath column_path, org.apache.cassandra.avro.ConsistencyLevel consistency_level)
    throws org.apache.avro.ipc.AvroRemoteException, org.apache.cassandra.avro.InvalidRequestException, org.apache.cassandra.avro.NotFoundException, org.apache.cassandra.avro.UnavailableException, org.apache.cassandra.avro.TimedOutException;
  java.lang.Void insert(org.apache.avro.util.Utf8 keyspace, org.apache.avro.util.Utf8 key, org.apache.cassandra.avro.ColumnPath column_path, java.nio.ByteBuffer value, long timestamp, org.apache.cassandra.avro.ConsistencyLevel consistency_level)
    throws org.apache.avro.ipc.AvroRemoteException, org.apache.cassandra.avro.InvalidRequestException, org.apache.cassandra.avro.UnavailableException, org.apache.cassandra.avro.TimedOutException;
  java.lang.Void batch_insert(org.apache.avro.util.Utf8 keyspace, org.apache.avro.util.Utf8 key, java.util.Map<org.apache.avro.util.Utf8,org.apache.avro.generic.GenericArray<org.apache.cassandra.avro.ColumnOrSuperColumn>> cfmap, org.apache.cassandra.avro.ConsistencyLevel consistency_level)
    throws org.apache.avro.ipc.AvroRemoteException, org.apache.cassandra.avro.InvalidRequestException, org.apache.cassandra.avro.UnavailableException, org.apache.cassandra.avro.TimedOutException;
  org.apache.avro.util.Utf8 get_api_version()
    throws org.apache.avro.ipc.AvroRemoteException;
}