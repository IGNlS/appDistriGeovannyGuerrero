namespace app.clientesgg.services.EventMQ
{
    public interface IRabbitMQService
    {
        Task PublishMessage<T>(T message, string queueName);
    }
}
