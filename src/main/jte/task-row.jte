@param com.nerdmeeting.springbootjtehtmx.entity.Task task

<tr>
    <td class="whitespace-nowrap py-4 pl-4 pr-3 text-sm font-medium sm:pl-0">${task.getDescription()}</td>
    <td class="whitespace-nowrap px-3 py-4 text-sm text-gray-500">Pending</td>
    <td class="relative whitespace-nowrap py-4 pl-3 pr-4 text-right text-sm font-medium sm:pr-0">
        <button hx-delete="/tasks/${task.getId()}"
                hx-target="closest tr"
                hx-swap="outerHTML swap:0.3s"
                class="text-indigo-400 hover:text-indigo-800">
            Delete<span class="sr-only">, ${task.getDescription()}</span>
        </button>
    </td>
</tr>