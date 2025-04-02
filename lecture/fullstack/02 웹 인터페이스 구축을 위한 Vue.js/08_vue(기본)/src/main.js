import { createApp } from 'vue'
import App from './App.vue'
import Calc from './components/Calc.vue'
import Calc2 from './components/Calc2.vue'
import Calc3 from './components/Calc3.vue'
import Calc4 from './components/Calc4.vue'
import Calc5 from './components/Calc5.vue'

const app = createApp(App)
app.component('Calc', Calc)
app.component('Calc2', Calc2)
app.component('Calc3', Calc3)
app.component('Calc4', Calc4)
app.component('Calc5', Calc5)
app.mount('#app')