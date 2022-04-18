import axios from "axios";

const CLIENTES_REST_API_URL = 'http://localhost:8080/api/clientes';

class clientesService{
    getClientes(){
        return axios.get(CLIENTES_REST_API_URL); 
    }
}

export default new clientesService()