import { createApp } from 'vue'
import App from './App.vue'
import NoSlotTest from './components/NoSlotTest.vue'
import SlotTest from './components/SlotTest.vue'

const app = createApp(App)
app.component('NoSlotTest', NoSlotTest)
app.component('SlotTest', SlotTest)
app.mount('#app')