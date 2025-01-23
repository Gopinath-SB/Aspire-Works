const amqp = require('amqplib');

async function sendMessage() {

    const connection = await amqp.connect("amqps://bdufsvea:bfblus1mHqeblmPWt-F7lcI1FkgWgj45@sparrow.rmq.cloudamqp.com/bdufsvea");
    const channel = await connection.createChannel();
    const queue = "aspire";
    await channel.assertQueue(queue, { durable: false });
    channel.sendToQueue(queue, Buffer.from("Hello Aspirians"));

    setTimeout(() => {
        channel.close();
        connection.close()
    }, 500)

}

sendMessage();