package com.angi.sooper;

import java.util.HashSet;
import java.util.Set;

/**
 * Datos del pedido.
 */
public class Pedido implements IPedido {
    /**
     * Identificador del pedido.
     */
    private String referencia;
    /**
     * Tipo de contenedor del pedido.
     */
    private Set<IContenedor> contenedores;

    /**
     * Constructor parametrizado.
     *
     * @param referencia identificadora del pedido.
     */
    public Pedido(String referencia) {
        this.referencia = referencia;
        this.contenedores = new HashSet<>();
    }

    /**
     * Obtiene la referencia del pedido.
     *
     * @return la referencia del pedido.
     */
    @Override
    public String getReferencia() {
        return referencia;
    }

    /**
     * Obtiene el producto del pedido.
     *
     * @return producto del pedido.
     */
    @Override
    public Set<IProducto> getProductos() {
        return null;
    }

    /**
     * Obtiene el tipo de contenedor que usa el pedido.
     *
     * @return el tipo de contenedor del pedido.
     */
    @Override
    public Set<IContenedor> getContenedores() {
        return contenedores;
    }

    /**
     * Agrega el tipo de contenedor que usa el pedido.
     *
     * @param contenedor utilizado en el pedido.
     */
    @Override
    public void addContenedor(IContenedor contenedor) {
        contenedores.add(contenedor);
    }

    /**
     * Agrega el producto al pedido.
     *
     * @param producto tipo de producto agregado.
     * @return el producto agregado al pedido.
     */
    @Override
    public IContenedor addProducto(IProducto producto) {
        return null;
    }
}
