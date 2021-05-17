<template>
  <ul>
    <li class="list-group-item">
      <div class="handle">
        <a href="javascript:; " @click="deleteItem">删除</a>
      </div>
      <p class="user"><span>{{comment.name}}</span><span>说:</span></p>
      <p class="centence">{{comment.content}}</p>
    </li>
  </ul>
</template>

<script>
export default {
  name: 'Item',
  props: {
    // 指定属性名和属性值的类型
    comment: Object,
    deleteItem: Function,
    index: Number
  },
  methods: {
    deleteItem () {
      const { comment, index, deleteItem } = this
      if(window.confirm(`确认删除${ comment.name }的评论吗？`)){
        this.deleteItem(index)
      }
    }
  }
}
</script>

<style scoped>
li {
  transition: .5s;
  overflow: hidden;
}
.handle {
  width: 40px;
  border: 1px solid #ccc;
  background: #fff;
  position: absolute;
  right: 10px;
  top: 1px;
  text-align: center;
}
.handle a {
  display: block;
  text-decoration: none;
}
.list-group-item .centence {
  padding: 0px 50px;
}
.user {
  font-size: 22px;
}
</style>
