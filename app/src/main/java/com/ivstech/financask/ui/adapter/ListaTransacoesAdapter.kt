package com.ivstech.financask.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import com.ivstech.financask.R

class ListaTransacoesAdapter(transacoes: List<String>, context: Context) : BaseAdapter () {
    private val transacoes = transacoes
    private val context = context

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        return  LayoutInflater.from(context).inflate(R.layout.transacao_item, parent, false)
    }

    override fun getItem(position: Int): String {
        return transacoes[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return transacoes.size
    }
}