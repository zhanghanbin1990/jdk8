package dataStructure.list;

/**
 * 循环链表
 */
public class CLLNode {
    private int data;
    private CLLNode next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public CLLNode getNext() {
        return next;
    }

    public void setNext(CLLNode next) {
        this.next = next;
    }

    /**
     * 从0开始计数，因为最后还要指回头结点
     * @param headNode
     * @return
     */
    public int getCLLNodeLength(CLLNode headNode) {
        int count = 0;
        CLLNode currentNode = headNode;
        while (null != currentNode) {
            count++;
            currentNode = currentNode.getNext();
            if (currentNode == headNode) {
                break;
            }
        }
        return count;
    }

    public void printCLLNodeData(CLLNode headNode) {
        CLLNode currentNode = headNode;
        while (null != currentNode) {
            System.out.println("当前结点的内容为：" + currentNode.getData());
            currentNode = currentNode.getNext();
            if (currentNode == headNode) {
                break;
            }
        }
        System.out.println("头结点的内容为："+headNode.getData());
    }


}
