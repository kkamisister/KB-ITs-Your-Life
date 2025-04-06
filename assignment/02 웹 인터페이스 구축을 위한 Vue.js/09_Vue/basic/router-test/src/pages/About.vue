<template>
  <div class="card card-body">
    <h2>About</h2>
    <p>요청경로 : {{ route.fullPath }}</p>
  </div>
</template>
<script>
import { useRoute } from 'vue-router'
export default {
  name: 'About',
  setup() {
    const route = useRoute()
    return { route }
  },
}
</script>
