package atividades.arvoreBinariaDeBusca;

public class No<T> implements INo<T>{

    T valor;
    No<T> filhoEsquerdo;
    No<T> filhoDireito;
    No<T> pai;

    @Override
    public void setValor(T valor) {

    }

    @Override
    public void setPai(No no) {

    }

    @Override
    public void setFilhoEsquerdo(No no) {

    }

    @Override
    public void setFilhoDireito(No no) {

    }

    @Override
    public int getValor() {
        return 0;
    }

    @Override
    public No getPai() {
        return null;
    }

    @Override
    public No getFilhoEsquerdo() {
        return null;
    }

    @Override
    public No getFilhoDireito() {
        return null;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
