const amqp = require('amqplib');
async function receiveMessage() {

    const connection = await amqp.connect("amqps://bdufsvea:bfblus1mHqeblmPWt-F7lcI1FkgWgj45@sparrow.rmq.cloudamqp.com/bdufsvea");
    const channel = await connection.createChannel();
    const queue = "Aspire";
    await channel.assertQueue(queue, { durable: false });
    channel.consume(queue, (msg) => {

        console.log("%s", msg.content.toString());


    }, { noAck: true })

}

receiveMessage();