package com.company;

public class CustomLinkedList<T> {

    private Node<T> last;
    private Node<T> first;
    private Integer size = 0;

    private class Node<T> {

        private Node<T> next;
        private T element;

        public Node() {
        }

        public Node(Node<T> next, T element) {
            this.next = next;
            this.element = element;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Node<?> node = (Node<?>) o;

            if (next != null ? !next.equals(node.next) : node.next != null) return false;
            return element != null ? element.equals(node.element) : node.element == null;
        }

        @Override
        public int hashCode() {
            int result = next != null ? next.hashCode() : 0;
            result = 31 * result + (element != null ? element.hashCode() : 0);
            return result;
        }
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(null, element);
        Node<T> interim = last;
        last = newNode;
        if (interim == null) {
            first = newNode;
        } else {
            interim.next = newNode;
        }
        size++;
    }

    public void addByIndex(int index, T element) {
        Node<T> tNode = first;
        for (int i = 0; i < index - 1; i++) {
            tNode = tNode.next;
        }
        Node<T> newNode = new Node<>(tNode.next, element);
        tNode.next = newNode;
        size++;
    }

    public T getFirst() {
        return first.element;
    }

    public T getLast() {
        return last.element;
    }

    public T getElement(int index) {
        Node<T> tNode = first;
        for (int i = 0; i < index; i++) {
            tNode = tNode.next;
        }
        return tNode.element;
    }

    public void remove(int index) {
        Node<T> tNode = first;
        for (int i = 0; i < index - 1; i++) {
            tNode = tNode.next;
        }
        tNode.next = tNode.next.next;
        size--;
    }

    public Integer size() {
        return size;
    }

    @Override
    public String toString() {
        String array = "CustomLinkedList{";
        for (int i = 0; i < size; i++) {
            array += getElement(i) + ",";
            if (i == size - 1) {
                array = array.substring(0, array.length() - 1);
            }
        }
        array += "};";
        return array;
    }
}
