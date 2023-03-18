package com.rvictor.orgs.ui.dao

import com.rvictor.orgs.ui.modelo.Produtos

class ProdutosDao {

    fun adicionar(produto: Produtos){
        produtos.add(produto)
    }
    fun buscaTodos() : List<Produtos>{
        return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produtos>()
    }
}