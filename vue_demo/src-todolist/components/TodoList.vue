<template>
  <ul class="todo-main">
    <todo-item v-for="(todo, index) in todos" :key="index" :index="index" :todo="todo" :deleteTodo="deleteTodo" />
  </ul>
</template>

<script>
import TodoItem from './TodoItem'
export default {
  name: 'TodoList',
  props: {
    todos: Array,
    deleteTodo: Function
  },
  components: { TodoItem }
}
</script>

<style scoped>
.todo-main{
  margin-left: 0;
  border: 1px solid #dddddd;
  border-radius: 2px;
  padding: 0;
}
.todo-empty{
  height: 40px;
  line-height: 40px;
  border: 1px solid #dddddd;
  padding-left: 5px;
  margin-top: 5px;
}
</style>
