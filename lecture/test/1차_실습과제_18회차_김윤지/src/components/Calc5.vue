<template>
  <div>
    x : <input type="text" v-model.number="x" />
    <br />
    결과 : {{ result }}
  </div>
</template>
<script>
import { ref, watch } from 'vue'

// Calc5 컴포넌트 정의
export default {
  name: 'Calc5',
  setup() {
    const x = ref(0) // 0으로 초기화
    const result = ref(0) // 0으로 초기화
    watch(x, (newValue, oldValue) => {
      console.log(`이전값=${oldValue}, 새값=${newValue}`)
    })

    return { x, result }
  },
}
</script>
