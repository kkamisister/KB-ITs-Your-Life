import { createApp } from 'vue'
// import App from './App.vue'
// import App from './App2.vue'
import App from './App3.vue'
import CheckboxItem from './components/CheckboxItem2.vue'

import './assets/main.css'

// mount 하기 전에 등록해야함 : .component('CheckboxItem', CheckboxItem)
// createApp(App).component('CheckboxItem', CheckboxItem).mount('#app')
createApp(App).mount('#app')
