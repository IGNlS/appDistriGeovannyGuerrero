using app.clientesgg.dataAccess.context;
using app.clientesgg.entities.models;

namespace app.clientesgg.dataAccess.repositories
{
    public class ClienteRepository : CrudGenericService<Cliente>, IClienteRepository
    {
        public ClienteRepository(AppDbContext context) : base(context)
        {

        }

        public async Task<Cliente> Insertar(Cliente cliente)
        {
            return await InsertEntity(cliente);
        }

        public async Task Eliminar(int id)
        {
            await DeleteEntity(id);
        }

        public async Task<Cliente> SeleccionarUno(int id)
        {
           return await SelectEntity(id);
        }

        public async Task<List<Cliente>> SeleccionarTodos()
        {
            return await SelectEntitiesAll();
        }

        public async Task Actualizar(Cliente cliente)
        {
            await UpdateEntity(cliente);
        }
    }
}
