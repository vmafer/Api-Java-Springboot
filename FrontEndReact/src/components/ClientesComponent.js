import React from "react";
import ClientesService from "../services/ClientesService";

class ClientesComponent extends React.Component{

    constructor(props){
        super(props)
            this.state = {
                cliente:[]
            }
        }
    
    
    componentDidMount(){
        ClientesService.getClientes().then((response) => {
            this.setState({cliente: response.data});
        });
    }
    
    render(){
        return(
            <div>
                <h1 className="text-center">Clientes</h1>
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <td>Cliente Id</td>
                            <td>Cliente Nome</td>
                            <td>Cliente CPF</td>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.cliente.map(
                                cliente =>
                                <tr key={cliente.id}>
                                    <td>{cliente.id}</td>
                                    <td>{cliente.nome}</td>
                                    <td>{cliente.cpf}</td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>

            </div>
        )
    }


}
export default ClientesComponent