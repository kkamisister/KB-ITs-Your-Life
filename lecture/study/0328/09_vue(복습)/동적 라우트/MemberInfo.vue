<template>
  <!-- 첫 번째 코드: React 스타일 className 사용 (Vue에선 비권장/오류 발생 가능) -->
  <!-- <div className="mt-5"> -->

  <!-- 두 번째 코드: Vue에서 정상 작동하는 class 속성 -->
  <div class="mt-5">
    <img :src="member.photo" class="img" />
    <h4 class="mt-2">{{ member.name }}({{ member.role }})</h4>
    <p>{{ member.desc }}</p>

    <a
      v-if="member.insta && member.insta !== ''"
      class="fa fa-instagram m-1"
      :href="member.insta"
    ></a>
    <a
      v-if="member.facebook && member.facebook !== ''"
      class="fa fa-facebook m-1"
      :href="member.facebook"
    ></a>
    <a
      v-if="member.youtube && member.youtube !== ''"
      class="fa fa-youtube m-1"
      :href="member.youtube"
    ></a>

    <br /><br />
    <router-link to="/members">멤버 목록으로</router-link>
  </div>
</template>

<script>
import { useRoute } from 'vue-router'
import members from '@/members.json'

export default {
  name: 'MemberInfo',
  setup() {
    const currentRoute = useRoute()
    const id = parseInt(currentRoute.params.id, 10)
    const member = members.find((m) => m.id === id)
    return { member }
  },
}
</script>
