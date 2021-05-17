<template>
 <mt-button type="primary" @click.native="handleClick" style="width: 100%">Test</mt-button>
</template>

<script>
import { Toast } from 'mint-ui'
export default {
  name: 'App',
  methods: {
    handleClick () {
      Toast('提示消息')
    }
  }
}
</script>

<style scoped>
</style>
