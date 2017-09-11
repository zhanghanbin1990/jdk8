package dataStructure.list;


/**
 * 双向链表
 */
public class DLLNode {
    private int data;
    private DLLNode previousNode;
    private DLLNode nextNode;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DLLNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DLLNode previousNode) {
        this.previousNode = previousNode;
    }

    public DLLNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DLLNode nextNode) {
        this.nextNode = nextNode;
    }

    public int listLength(DLLNode headerNode) {
        int count = 1;
        DLLNode currentNode = headerNode;
        while (null != currentNode) {
            count++;
            currentNode = currentNode.getNextNode();
        }
        return count;
    }

    //双向链表的插入
    public DLLNode insertDLLNode(DLLNode header, DLLNode insertNode, int position) {
        int size = listLength(header);
        if (position > size || position < 1) {
            System.out.println("输入有误，正确范围为1~" + (size + 1));
        }
        //表头插入
        if (1 == position) {
            insertNode.setNextNode(header);
            header.setPreviousNode(insertNode);
            return insertNode;
        } else {
            int count = 1;
            DLLNode previosNode = header;
            while (count < position) {
                count++;
                previosNode = previousNode.getNextNode();
            }
            DLLNode currentNode = previosNode.getNextNode();
            insertNode.setPreviousNode(previousNode);
            previosNode.setNextNode(insertNode);
            insertNode.setNextNode(currentNode);
            if (null != currentNode) {
                //不是链表尾时
                currentNode.setPreviousNode(insertNode);
            }
        }
        return header;
    }

    //双向链表的删除
    public DLLNode deleteNode(DLLNode headerNode, int position) {
        int size = listLength(headerNode);
        if (position > size || position < 1) {
            System.out.println("输入有误，正确范围为：1~"+size);
        }
        if (1 == position) {
            DLLNode currentNode = headerNode.getNextNode();
            headerNode = null;
            currentNode.setPreviousNode(null);
            return currentNode;
        } else {
            int count = 1;
            DLLNode previousNode = headerNode;
            while (count < position) {
                count++;
                previousNode = previousNode.getNextNode();
            }
            DLLNode currentNode = previousNode.getNextNode();
            DLLNode laterNode = currentNode.getNextNode();
            previousNode.setNextNode(laterNode);
            if (null != laterNode) {
                laterNode.setPreviousNode(previousNode);
            }
            currentNode = null;
        }

       return headerNode;
    }

}
