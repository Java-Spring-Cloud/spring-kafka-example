# Sample Application to Send and Receive Messages via Kafka Topic With Basic Configurations.
## Add @enableKafka Annotation  -- in main application
## maintain seperate configs for producer and consumer -- producerConfig and ConsumerConfig
## Use KafkaTemplate to send message on to topic
## User @KafkaListener to listen messages posted on to Topic
### Consumer should be assigned to one specific Group and Kafka controls the message to only one consumer in that group ; to avoid duplicates
### There may be multiple Consumer Groups like HDFS, Cassandra , Log
### maintaining offset of Topic/Partition is consumer responsibility.- which is not implemeted here.