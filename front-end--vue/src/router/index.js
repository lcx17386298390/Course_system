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
import Collection from "../components/Collection.vue"
import PlayRecord from "../components/PlayRecord.vue"
import Learned from "../components/Learned.vue"
import Create from "../components/Create.vue"
import myMes from "../components/MyMes.vue"
import coursePage from "../components/CoursePage.vue"
import ChapterPage from "../components/ChapterPage.vue"
import CreateCourse from "../components/CreateCourse.vue"
import EditCourse from "../components/EditCourse.vue"
import ChapterEdit from "../components/ChapterEdit.vue"
import NoTailHome from "../components/NoTailHome.vue"

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
                    component: Mine,
                    children: [
                        {
                            path: "myCollection",
                            component: Collection
                        },
                        {
                            path: "myPlayRecord",
                            component: PlayRecord
                        },
                        {
                            path: "myLearned",
                            component: Learned
                        },
                        {
                            path: "myCreated",
                            component: Create
                        },
                        {
                            path: "myMes",
                            component: myMes
                        }
                    ]
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
        },
        {
            path: '/coursePage/:courseNumber',
            component: Home,
            children: [
                {
                    path: "/",
                    component: coursePage
                }
            ]
        },
        {
            path: '/chapterPage/:courseNumber/:chapterNum',
            component: ChapterPage
        },
        {
            path: '/CreateCourse',
            component: Home,
            children: [
                {
                    path: "/",
                    component: CreateCourse 
                }
            ]
        },
        {
            path: '/editCourse/:courseNumber',
            component: NoTailHome,
            children: [
                {
                    path: "/",
                    component: EditCourse,
                    children: [
                        {
                            path:'chapter',
                            component: ChapterEdit
                        }
                    ]
                }
            ]
        }
    ]
})

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location){
    return originalPush.call(this,location).catch(err=>err)
}