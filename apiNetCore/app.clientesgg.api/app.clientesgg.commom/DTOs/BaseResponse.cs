namespace app.clientesgg.common.DTOs
{
    public class BaseResponse<TResult>
    {
        public bool Success { get; set; }

        public string? ErrorMessage { get; set; }

        public TResult? Result { get; set; }
    }
}
