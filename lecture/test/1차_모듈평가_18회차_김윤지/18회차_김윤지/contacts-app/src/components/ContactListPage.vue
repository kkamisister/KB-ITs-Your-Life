<template>
  <div class="container">
    <h1>연락처</h1>
    <div>
      <ul class="list-group">
        <li
          v-for="contactitem in contactlist"
          :key="contactitem.no"
          :name="contactitem.name"
        >
          <h1>{{ name }}</h1>
        </li>
      </ul>
    </div>
  </div>
</template>

<script setup>
import axios from 'axios'

const getContactList = async () => {
  const url = '/api/contacts'
  const response = await axios.get(url)
  const contactlist = response.data
  return contactlist
}
getContactList()
</script>

<style scoped></style>
