<template>
  <div>
    X : <input type="text" v-model.number="x" /><br />
    <div>결과 : {{ result }}</div>
  </div>
</template>
<script>
import { watch, ref } from 'vue'
export default {
  name: 'Calc5',
  setup() {
    const x = ref(0)
    const result = ref(0)
    watch(x, (cur, old) => {
      console.log(`${old} => ${cur}`)
      result.value = cur
    })
    return { x, result }
  },
}
</script>
