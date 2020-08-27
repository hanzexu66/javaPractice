package com.AdjacencyList;

import java.util.ArrayList;
import java.util.List;

public class graph {
    class Enode {
        int num;
        Enode next;
    }

    class Vnode {
        String data;
        Enode first;
    }

    private List<Vnode> vnodes = new ArrayList<>();

    public void addVnode(String name) {
        //名称重复检测
        Vnode vnode = new Vnode();
        vnode.data = name;
        vnode.first = null;
        vnodes.add(vnode);
    }

    private int getNum(String name) {
        for (int i = 0; i < vnodes.size(); i++) {
            if (vnodes.get(i).data == name) return i;
        }
        return -1;
    }

    private void addNum(int a, int b) {
        Enode enode = new Enode();
        enode.next = null;
        enode.num = b;
        if (vnodes.get(a).first == null) {
            vnodes.get(a).first = enode;
        } else {
            Enode enode1 = vnodes.get(a).first;
            while (enode1.next != null) enode1 = enode1.next;
            enode1.next = enode;
        }
    }

    public void addEnode(String name1, String name2) {
        //名称是否存在检测
        int a = getNum(name1);
        int b = getNum(name2);
        addNum(a, b);
    }

    public void printAllEdges()
    {
        for (Vnode i : vnodes) {
            System.out.print("以" + i.data + "为起点：");
            Enode enode = i.first;
            while(enode != null){
                System.out.print(vnodes.get(enode.num).data+" ");
                enode=enode.next;
            }
        }
    }
}