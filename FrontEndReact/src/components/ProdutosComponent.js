import React from "react";
import ProdutosService from "../services/ProdutosService";

class ProdutosComponent extends React.Component{

    constructor(props){
        super(props)
            this.state = {
                produto:[]
            }
        }
    
    
    componentDidMount(){
        ProdutosService.getProdutos().then((response) => {
            this.setState({produto: response.data});
        });
    }
    
    render(){
        return(
            <div>
                <h1 className="text-center">Produtos</h1>
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <td>Produto Nome</td>
                            <td>Produto Preço</td>
                            <td>Produto Desconto</td>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.produto.map(
                                produto =>
                                <tr key={produto.id}>
                                    <td>{produto.nome}</td>
                                    <td>{produto.preco}</td>
                                    <td>{produto.desconto}</td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>

            </div>
        )
    }


}
export default ProdutosComponent