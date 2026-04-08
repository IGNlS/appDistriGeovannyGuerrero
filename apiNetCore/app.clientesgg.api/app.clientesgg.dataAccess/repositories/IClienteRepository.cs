using app.clientesgg.entities.models;

namespace app.clientesgg.dataAccess.repositories
{
    public interface IClienteRepository
    {
        Task<Cliente> SeleccionarUno(int id);

        Task<Cliente> Insertar(Cliente cliente);

        Task<List<Cliente>> SeleccionarTodos();

        Task Actualizar(Cliente cliente);

        Task Eliminar(int id);

    }
}
