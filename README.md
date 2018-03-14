# structure
记录自己数据结构的学习过程


# Stack
## 基于数组实现和基于链表实现的比较

### 基于数组实现

- 每个操作都是常数时间开销
- 每隔一段时间倍增操作的开销较大
- n个操作的任意序列的平摊时间开销为O(n）

### 基于链表实现

- 栈规模的增加和减小都很简洁
- 各个操作都是常数时间开销
- 每个操作都需要额外的空间和时间开销来处理指针


# 二叉树

## 类型
- 严格二叉树：每个结点要么有两个孩子，要么没有孩子
- 满二叉树:每个结点恰好有两个孩子结点且所有叶子结点在同一层
- 完全二叉树

# 通用数

- 同一个双亲结点（兄弟）的孩子结点从左至右排列
- 双亲结点只指向第一个孩子结点，删除从双亲到其他孩子结点的连接

# 二叉搜索树(二叉排序树)

- 一个结点的左子树只能包含键值小于该结点键值的结点
- 一个结点的右子树只能包含键值大于该结点键值的结点
-
