import { createApp } from 'vue'
import App from './App.vue'
import CheckboxItem from './components/CheckboxItem.vue'
import CheckboxItem2 from './components/CheckboxItem2.vue'
import InputName from './components/InputName.vue'

const app = createApp(App)
app.component('CheckboxItem', CheckboxItem)
app.component('CheckboxItem2', CheckboxItem2)
app.component('InputName', InputName)
app.mount('#app')