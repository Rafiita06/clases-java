void insetOrdenado(int x){
    Nodo +p, *q, *ant;
    p=p->CrearNodo(x);
    if(esVacia()){
        cab=p;
    }else{
        q=cab;
        ant=q;
        if(p->getDato() < q->getDato()){
            p->conectar(q);
            cab=p;
        }
        else{
            while((q->getSig()!=NULL)&&(q->getDato()< p->getDato())){
                ant=q;
                q=q->getSig();
            }
            if(p->getDato() < q->getDato()){
                p->conectar(q);
                ant->conectar(p);
            }
            else{
                q->conectar(p);
            }
        }
    }
}