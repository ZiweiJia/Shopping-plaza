# Shopping-plaza <br>
The shopping plaza project includes all back-end management system. It has Search Product Managment, Order Management, Brand Management, User Management and
Mamber Management.<br>

## Search Product Managment part
Implement this feature by using Elasticsearch. Elasticsearch is a distributed, scalable, real-time and data anaylsis engine. In this function, it gives you ability to search, analyze, and explore the data. Furthermore, it can be used for full-text search and real-time statistics.

## Order Management part
Utilize RabbitMQ to implement the order system. RabbitMQ is widely used open source message queue. It is lightweight and easy to deploy, and it supports a varity of messaging protocols. When user place the order, the system generate a order object and order id. Next, we set a timer to wait for payment from user(if it is unpaid, the order will be canceled). The RabbitMQ will deal with the cancel operation.

## Brand Management part
Use SpringBoot and Mybatis to construct the basic architecture of the project. Mybatis is used to make mappers. SpringBoot provides plenty of web containers for project.

## User and Memeber Management part
Take Redis to handle high-access loads of large data. Elasticsearch can save the time to query, import, modify and delete information.



