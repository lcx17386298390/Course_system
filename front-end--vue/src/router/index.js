import VueRouter from "vue-router";
import Index from "../components/Index.vue"
import Home from "../components/Home.vue"
import upFile from "../components/upFile.vue"
import Login from "../components/Login.vue"
import Mine from "../components/Mine.vue"
import CourseList from "../components/CourseList.vue"
import LessonPage from "../components/LessonPage.vue"
import Register from "../components/Register.vue"
import Test from "../components/Test.vue"

export default new VueRouter({
    mode: 'hash',
    base: '/',
    routes:[
        {
            path: '/',
            component: Home,
            children:[
                {
                    path:"/",
                    component: Index
                }
            ]
        },
        {
            path: '/login',
            component: Login
        },
        {
            path: '/upFile',
            component: Home,
            children:[
                {
                    path:"/",
                    component: upFile
                }
            ]
        },
        {
            path: '/mine',
            component: Home,
            children:[
                {
                    path:"/",
                    component: Mine
                }
            ]
        },
        {
            path: '/courseList',
            component: Home,
            children: [
                {
                    path: "/",
                    component: CourseList
                }
            ]
        },
        {
            path: '/lessonPage',
            component: Home,
            children: [
                {
                    path: "/",
                    component: LessonPage
                }
            ]
        },
        {
            path: '/register',
            component: Register
        },
        {
            path: '/test',
            component: Test
        }
    ]
})

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location){
    return originalPush.call(this,location).catch(err=>err)
}