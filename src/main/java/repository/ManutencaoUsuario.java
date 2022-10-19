/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import model.MdlAbrigo;
import model.MdlFrete;
import model.MdlLocalidade;

/**
 *
 * @author a gente
 */
public interface ManutencaoUsuario{
    
    //Adiciona abrigo
    public void addAbrigo(MdlAbrigo abrigo);
    //Remove abrigo --> poderia ser compareble
    public void removerAbrigo(MdlAbrigo abrigo);
    //Adiciona localidade
    public void addLocalidade(MdlLocalidade localidade);
    //Remove localidade
    public void removerLocalidade(MdlLocalidade localidade);
    //Adiciona frete
    public void addFrete(MdlFrete frete);
    //Exclui um frete de acordo com a placa
    public void removerFrete(String placaFrete);
}
