package com.angi.sooper;

import com.angi.sooper.enums.Categoria;

/**
 * Datos necesarios para ser implementados en producto:
 * Obtener la referencia del producto.
 * Obtener el peso del producto.
 * Obtener el volumen del producto.
 * Obtener la categoría del producto.
 * Comprobar si un producto puede compartir espacio con otro dentro de un contenedor.
 * Comprobar si el contenedor tiene espacio suficiente para agregar otro producto.
 * Identificar cuando un producto ya está dentro del contenedor.
 */

public interface IProducto {
    String getReferencia();
    int getPeso();
    int getVolumen();
    Categoria getCategoria();
    boolean esCompatible(IProducto p);
    boolean tengoEspacio(IContenedor contenedor);
    void meter(IContenedor contenedor);
}
