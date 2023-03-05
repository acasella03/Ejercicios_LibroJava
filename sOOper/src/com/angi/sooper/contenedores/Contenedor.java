package com.angi.sooper.contenedores;

import com.angi.sooper.IContenedor;
import com.angi.sooper.IProducto;

import java.util.Set;

/**
 * Describe los datos necesarios de un contenedor.
 */
public abstract class Contenedor implements IContenedor {
    /**
     * Identificador de un contenedor.
     */
    private String referencia;
    /**
     * Indica la altura de un contenedor.
     */
    private int alto;
    /**
     * Indica la capacidad de resistencia de un contenedor.
     */
    private int resistencia;
    /**
     * Producto en un contenedor.
     */
    private Set<IProducto> producto;

    /**
     * Constructor parametrizado.
     *
     * @param referencia del contenedor.
     * @param alto       del contenedor.
     */
    public Contenedor(String referencia, int alto) {
        this.referencia = referencia;
        this.alto = alto;
    }

    /**
     * Obtiene la referencia del contenedor.
     *
     * @return la referencia del contenedor.
     */
    @Override
    public String getReferencia() {
        return referencia;
    }

    /**
     * Obtiene el volumen del contenedor.
     *
     * @return el valor del volumen del contenedor.
     */
    @Override
    public int getVolumen() {
        return alto * getSuperficie();
    }

    /**
     * Obtiene el volumen restante una vez agregados productos.
     *
     * @return el valor del volumen disponible.
     */
    @Override
    public int volumenDisponible() {
        return 0;
    }

    /**
     * Obtiene la resistencia soportada por el contenedor.
     *
     * @return su resistencia.
     */
    @Override
    public int getResistencia() {
        return resistencia;
    }

    /**
     * Obtiene los productos existentes en un contenedor.
     *
     * @return producto.
     */
    @Override
    public Set<IProducto> getProductos() {
        return producto;
    }

    /**
     * Comprueba si un producto cabe o no en el contenedor y lo agrega o no.
     *
     * @param producto para agregar.
     * @return si cabe o no.
     */
    @Override
    public boolean meter(IProducto producto) {
        return false;
    }

    /**
     * Comprueba la resistencia del contenedor ante un producto.
     *
     * @param producto a soportar por el contenedor.
     * @return si lo soporta o no.
     */
    @Override
    public boolean resiste(IProducto producto) {
        return false;
    }
}
