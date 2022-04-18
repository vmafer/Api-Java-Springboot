import axios from "axios";

const PRODUTOS_REST_API_URL = 'http://localhost:8080/api/produtos';

class produtosService{
    getProdutos(){
        return axios.get(PRODUTOS_REST_API_URL); 
    }
}

export default new produtosService()