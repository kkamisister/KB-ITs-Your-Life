<template>
  <div>
    <h2>관심있는 K-POP 가수?</h2>
    <ul>
      <CheckboxItem
        v-for="idol in idols"
        :key="idol.id"
        :id="idol.id"
        :name="idol.name"
        :checked="idol.checked"
      />
    </ul>

    <hr />

    <h2>관심있는 K-POP 가수? (객체로 전달)</h2>
    <ul>
      <CheckboxItem2
        v-for="idol in idols"
        :key="idol.id"
        :idol="idol"
      />
    </ul>

    <hr />

    <h2>이름 입력</h2>
    <InputName :name="userName" @nameChanged="onNameChanged" />
    <p>입력된 이름: {{ userName }}</p>
  </div>
</template>

<script>
export default {
  name: 'App',
  data() {
    return {
      idols: [
        { id: 1, name: 'BTS', checked: true },
        { id: 2, name: 'Black Pink', checked: false },
        { id: 3, name: 'EXO', checked: false },
        { id: 4, name: 'ITZY', checked: false },
      ],
      userName: '',
    };
  },
  methods: {
    onNameChanged(newName) {
      this.userName = newName;
    },
  },
};
</script>