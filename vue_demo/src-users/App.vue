<template>
  <div id="app">
    <div class="container">
      <Search />
      <Main />
    </div>
  </div>
</template>

<script>
import Search from './components/Search'
import Main from './components/Main'
export default {
  name: 'App',
  components: {Main, Search, }
}
</script>

<style scoped>
</style>
